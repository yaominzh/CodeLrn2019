package az.ee.streaming.customSource;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;

public class StreamingDemoWithMyParallelSource {
    public static void main(String[] args) throws Exception {
        // 0. 环， 取得Streamin环境

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // 1. 建， 建立source

        DataStream<Long> num= env.addSource(new MyParallelSource());
        // 2. 计算
        num.map(new MapFunction<Long, Long>() {
            @Override
            public Long map(Long value) throws Exception {
                System.out.println("receive data" + value);
                return value;
            }

        });

        DataStream<Long> sum = num.timeWindowAll(Time.seconds(2)).sum(0);
        // 3.输出
        sum.print().setParallelism(1);
        // 4. env.execute
        env.execute("StreamingFromCollection");
    }
}
