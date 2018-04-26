package com.gxx;

import com.gxx.mapper.GirlMapper;
import com.gxx.service.GirlService;
import com.vdurmont.emoji.EmojiParser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApplicationTests {
    @Value("${server.port}")
    private String port;
    @Autowired
    private GirlService girlService;
    @Autowired
    private GirlMapper girlMapper;

    @Test
    public void test() {
        girlService.test1(1);
        new Thread(() -> {
            test1();
            //girlService.test1(1);
            // System.out.println("+++++++++"+girlService.findGirlAll(12));
        }).start();
    }

    @Test
    public void test1() {
        //   String str = "An 😀awesome 😃string with a few 😉emojis!";
//        String str1 = "😉";
//        System.out.println("转换前:"+str);
//        String res = EmojiParser.removeAllEmojis(str1);
//        String res1 = EmojiParser.parseToAliases(str);
//        System.out.println("转换后："+res);
//        System.out.println("res1:" +res1);
//        System.out.println(EmojiParser.removeAllEmojis(str));
//        System.out.println(EmojiParser.parseToAliases(str));
//        System.out.println(EmojiParser.parseToUnicode(str));
        // girlService.test1(1);
        System.out.println(System.currentTimeMillis()+"11111111111111");
        List<Map<String, Object>> mapList = girlMapper.findAll11();
        System.out.println(mapList.toString());
        for (Map map : mapList) {
            System.out.println(map.get("id"));
        }
    }

}
