package com.gxx.service.lmpl;

import com.gxx.EmojiFilter;
import com.gxx.Girl;
import com.gxx.confing.MyException;
import com.gxx.mapper.GirlMapper;
import com.gxx.service.GirlService;
import com.vdurmont.emoji.EmojiParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 11246 on 2018/4/1  0001.
 */
@Service
//@Transactional(rollbackFor = Exception.class)
@Slf4j
public class GirlServicelmpl implements GirlService {
    @Autowired
    private GirlMapper girlMapper;

    @Override
    public List<Girl> findGirlAll(int id) {
        return girlMapper.findAll(id);
    }

    @Override
    public void test1(int a) {
        Girl girl = new Girl();
        girl.setAge(100);
        girl.setMoney(new BigDecimal(12345678));
       // String str = "An 😀awesome 😃string with a few 😉emojis!";
        String str = "😀";
        //girl.setStr( EmojiParser.removeAllEmojis(str));
        girl.setStr( EmojiFilter.filterEmoji(str));
        girlMapper.test1(girl);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // girlMapper.findAll1(520);
        log.info("a:{}", a);
        if (a < 0) {
            throw new MyException("参数不能小于0");
        }

    }


}
