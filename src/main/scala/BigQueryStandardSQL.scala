import com.google.cloud.bigquery.{BigQueryOptions, FieldValueList, JobInfo, QueryJobConfiguration}
import scala.jdk.CollectionConverters._

object BigQueryStandardSQL {
  def run(query: String): Iterable[FieldValueList] = {
    assert(query != null)

    val bigquery = BigQueryOptions.getDefaultInstance.getService
    val queryConfig = QueryJobConfiguration.newBuilder(query).build
    val jobInfo = JobInfo.newBuilder(queryConfig).build
    bigquery.create(jobInfo).getQueryResults().iterateAll.asScala
  }
}