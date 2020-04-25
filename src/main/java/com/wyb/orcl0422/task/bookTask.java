package com.wyb.orcl0422.task;

import com.wyb.orcl0422.dao.BookMapper;
import com.wyb.orcl0422.dao.DianjiMapper;
import com.wyb.orcl0422.pojo.Book;
import com.wyb.orcl0422.pojo.BookExample;
import com.wyb.orcl0422.pojo.Dianji;
import com.wyb.orcl0422.pojo.DianjiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/25   16:39
 */
@Component
public class bookTask {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    DianjiMapper dianjiMapper ;
    @Autowired
    private RedisTemplate redisTemplate ;

    @Scheduled(cron = "0/30 * * * * ?") //每隔30秒，更新一下数据库中的点击量的数据
    public void updateRedisTraffic() {
        System.out.println("=============我去执行updateRedisTraffic================================");
        //得到当前库中所有的书籍
        List<Dianji> djs = dianjiMapper.selectByExample(new DianjiExample());
        //再循环，拿到书籍的id去redis查询点击量，并且同步更新到数据库中
        if(djs!=null && djs.size()>0){
            for (Dianji dj : djs) {
                String id = dj.getbId();
                //判断id在redis是否存在
                if(redisTemplate.hasKey(id)) { //如果当前key在redis是存在的，则去同步数据库
                    Integer  count = (Integer) redisTemplate.opsForValue().get(id);
                    dj.setTraffic((int) count); //赋值
                    //更新数据库
                    dianjiMapper.updateBybId(dj);
                }
            }
        }


    }


}
