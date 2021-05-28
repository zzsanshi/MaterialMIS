package com.project.taskexecutor;

import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.Executor;

@EnableAsync//开启异步任务支持
@Component
public class TaskExecutorConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setQueueCapacity(25);
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

//    @Override
//    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//        return new AsyncUncaughtExceptionHandler() {
//            /**
//             * 自定义异常处理逻辑
//             * @param ex 抛出的异常
//             * @param method 抛出异常的方法
//             * @param params 抛出异常的方法参数
//             */
//            @Override
//            public void handleUncaughtException(Throwable ex, Method method, Object... params) {
//                System.out.println("-----自定义异常处理-------");
//                System.out.println(method.getName());
//                System.out.println(ex.getMessage());
//                System.out.println(Arrays.toString(params));
//                System.out.println("-----自定义异常处理-------");
//            }
//        };
//    }

}
