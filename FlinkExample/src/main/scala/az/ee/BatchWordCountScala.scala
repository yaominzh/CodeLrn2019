package az.ee

import org.apache.flink.api.scala.ExecutionEnvironment
import org.apache.flink.core.fs.FileSystem

object BatchWordCountScala {
  def main(args: Array[String]): Unit = {
    val inputPath = "/home/allenz/data/file"
    val outPath = "/home/allenz/data/resultScala"
    val env = ExecutionEnvironment.getExecutionEnvironment
    val text = env.readTextFile(inputPath)

    //引入隐式转换
    import org.apache.flink.api.scala._

    val counts = text.flatMap(_.toLowerCase.split("\\W+"))
      .filter(_.nonEmpty)
      .map((_,1))
      .groupBy(0)
      .sum(1)

    counts.writeAsCsv(outPath,"\n", " ",FileSystem.WriteMode.OVERWRITE).setParallelism(1)
    env.execute("batch word count scala")

  }

}
