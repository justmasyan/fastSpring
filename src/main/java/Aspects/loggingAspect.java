package Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class loggingAspect {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @Around("@annotation(ToLog)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        Object[] methodArgs = joinPoint.getArgs();
        Comment comment = new Comment();
        comment.setText("hahahah");
        comment.setAuthor("Nikola");
        Object[] newargs = {comment};
        logger.info("START" + methodName);
        joinPoint.proceed(newargs);
        logger.info("Finish" + Arrays.asList(methodArgs));

    }
}
