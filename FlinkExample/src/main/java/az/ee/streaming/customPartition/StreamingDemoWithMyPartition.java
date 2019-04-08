package az.ee.streaming.customPartition;
/*
use customized partition MyPartition
 */

import az.ee.streaming.customSource.MyNoParalleSource;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple1;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class StreamingDemoWithMyPartition {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<Long> text = env.addSource(new MyNoParalleSource());

        DataStream<Tuple1<Long>> tupleData = text.map(new MapFunction<Long, Tuple1<Long>>() {
            @Override
            public Tuple1 map(Long value) throws Exception {
                return new Tuple1<>(value);
            }
        });
        DataStream<Tuple1<Long>> partitionData=  tupleData.partitionCustom(new MyPartition(), 0);
        DataStream<Long> result = partitionData.map(new MapFunction<Tuple1<Long>, Long>() {
            @Override
            public Long map(Tuple1<Long> value) throws Exception {
                System.out.println("get current thread id, " + Thread.currentThread().getId()+",value "+value);
                return value.getField(0);
            }
        });
        result.print().setParallelism(1);
        env.execute("public class StreamingDemoWithMyPartition");
    }
}
