package com.jilinwula.ioc.resource;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;

/**
 * @author Bing Pei
 * @author jilinwula@foxmail.com
 * @date 2016-09-20 11:18
 * @since 1.0.1
 */
public class FileSourceTest {
    @Test
    public void test1() {
        Resource res1 = new FileSystemResource("C:\\jilinwula.com\\jilinwula\\jilinwula\\jilinwula\\jilinwula-ioc\\readme.md");
        Resource res2 = new ClassPathResource("applicationContext-ioc.xml");
        System.out.println(String.format("res1:%s", res1.getFilename()));
        System.out.println(String.format("res2:%s", res2.getFilename()));
    }

    @Test
    public void test2() throws IOException {
        Resource res = new FileSystemResource("C:\\jilinwula.com\\jilinwula\\jilinwula\\jilinwula\\jilinwula-ioc\\readme.md");
        EncodedResource encRes = new EncodedResource(res, "UTF-8");
        String content = FileCopyUtils.copyToString(encRes.getReader());
        System.out.println(content);
    }

    @Test
    public void test3() throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource [] resources = resolver.getResources("classpath*:applicationContext*.xml");
        for (Resource resource : resources) {
           System.out.println(resource.getDescription());
        }
    }
}
