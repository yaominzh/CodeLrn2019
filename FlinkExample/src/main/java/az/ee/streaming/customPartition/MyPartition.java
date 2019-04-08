package az.ee.streaming.customPartition;

import org.apache.flink.api.common.functions.Partitioner;

public class MyPartition  implements Partitioner<Long> {
    @Override
    public int partition(Long key, int numPartitions) {
        System.out.println("total number of partitions: " + numPartitions);
        if(key%2==0){
            return 0;
        }else {
            return 1;
        }
    }
}
