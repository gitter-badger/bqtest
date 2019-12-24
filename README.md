# bqtest
Test Standard SQL on BigQuery

# Usage (Not implemented)
```shell script
java -jar bqtest.jar <sql_file> <expected_avro_file> --with_a <avro_file> --with_b <avro_file> --project_id <project> --key-file <sql_file>
```

sql_file: The SQL file to test
expected_avro_file: The Avro file of expected output results
project_id: The ID of the project that runs the test (Optional)
key-file: The key file for permission to run test (Optional)
with_<alias>: The table files input as with clause