package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    public void execute() {
        long startTime = System.currentTimeMillis();

        call(); // 상속 자식에서 구현

        long endTime = System.currentTimeMillis();

        long resultTIme = endTime - startTime;
        log.info("resultTime={}", resultTIme);
    }

    protected abstract void call();
}
