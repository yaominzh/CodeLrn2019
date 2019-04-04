package az.ee

import az.ee.SockeWindowWorldCount.WordWithCount
import org.apache.flink.api.java.utils.ParameterTool
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.api.windowing.time.Time

object SockeWindowWorldCount {

  def main(args: Array[String]): Unit = {
    val port: Int = try {
      ParameterTool.fromArgs(args).getInt("port")
    } catch {
      case e: Exception => {
        System.err.println("No port set.. use default port 9000")
      }
        9000
    }
    val env: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment
    val text = env.socketTextStream("allenz-VirtualBox", port, '\n')
    import org.apache.flink.api.scala._
    val windowCounts = text.flatMap(line => line.split("\\s")).map(w => WordWithCount(w,1))
      .keyBy("word")
      .timeWindow(Time.seconds(2), Time.seconds(1))
      .sum("count")

    windowCounts.print().setParallelism(1)
    env.execute("socket window count scala")

  }
  case class WordWithCount(word: String, count: Long)
}
