import org.scalatest.FunSuite

class BigQueryStandardSQLTest extends FunSuite {
  test("HelloWorld.main") {
    BigQueryStandardSQL.run("SELECT 1 a FROM UNNEST([1,2])").foreach(value => {
      assert(value.get("a").getLongValue === 1)
    })
  }
}