import java.io.File

case class Config(
    sql_file: File = new File("."),
    expected_file: File = new File("."),
    project_id: String = "",
    key_file: File = new File("."),
    withs: Map[String, String] = Map(),
    maxCount: Int = -1,
    verbose: Boolean = false,
    debug: Boolean = false,
    mode: String = "",
    files: Seq[File] = Seq(),
    keepalive: Boolean = false,
    jars: Seq[File] = Seq()
)

object Main {
  def main(args: Array[String]): Unit = {
    val parser = new scopt.OptionParser[Config]("java -jar bqtest.jar") {
      head("bqtest", "0.1")

      // <sql_file> <expected_avro_file> --with_a <avro_file> --with_b <avro_file> --project_id <project> --key_file <sql_file>
      opt[File]('s', "sql_file")
        .required()
        .valueName("<sql_file>")
        .action((x, c) => c.copy(sql_file = x))
        .text("sql_file is a required file property")
      opt[File]('e', "expected_file")
        .required()
        .valueName("<avro_file>")
        .action((x, c) => c.copy(expected_file = x))
        .text("expected_file is a required file property")

      opt[Map[String, String]]('w', "with")
        .valueName("t1=<avro_file>,t2=<avro_file>...")
        .action((x, c) => c.copy(withs = x))
        .text("other arguments")

      opt[String]('p', "project_id")
        .action((x, c) => c.copy(project_id = x))
        .text("project_id is an string property")

      opt[File]('k', "key_file")
        .valueName("<key_file>")
        .action((x, c) => c.copy(key_file = x))
        .text("key_file is a required file property")

      help('h', "help").text("prints this usage text")

    }

    // parser.parse returns Option[C]
    parser.parse(args, Config()) match {
      case Some(config) =>
      // do stuff

      case None =>
      // arguments are bad, error message will have been displayed
    }
  }
}
