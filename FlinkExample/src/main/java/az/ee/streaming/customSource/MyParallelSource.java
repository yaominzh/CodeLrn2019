package az.ee.streaming.customSource;

import org.apache.flink.streaming.api.functions.source.ParallelSourceFunction;

public class MyParallelSource implements ParallelSourceFunction<Long> {
    private long count = 0L;
    private boolean isRunning = true;
    @Override
    public void run(SourceContext<Long> ctx) throws Exception {
        while(isRunning){
            ctx.collect(count);
            count++;
            Thread.sleep(1000);
        }

    }

    @Override
    public void cancel() {
        isRunning = false;

    }
}
