package com.sspu.varsityservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.web.servlet.config.annotation.*;

import java.util.concurrent.Executors;

@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

    @Override
    protected void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setTaskExecutor(new ConcurrentTaskExecutor(Executors.newFixedThreadPool(3)));
        configurer.setDefaultTimeout(30000);
    }

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*");
    }

    //设置访问图片的虚拟路径映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //文件磁盘图片url 映射 ，一下位windows下的
        //配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径
        registry.addResourceHandler("/images/**").addResourceLocations("file:D:\\images\\");


        /************************下边为linux系统下的 ******/
        // registry.addResourceHandler("/image/**").addResourceLocations("file:/home/userImages/");
        /*  registry.addResourceHandler("/carouselImages/**").addResourceLocations("file:/home/carouselImages/");
        registry.addResourceHandler("/courseImages/**").addResourceLocations("file:/home/courseImages/");
        registry.addResourceHandler("/teacherImages/**").addResourceLocations("file:/home/teacherImages/");
        registry.addResourceHandler("/systemImages/**").addResourceLocations("file:/home/systemImages/");
        registry.addResourceHandler("/articleImages/**").addResourceLocations("file:/home/articleImages/");*/
    }
}
