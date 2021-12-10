def call(def jobs) {
  echo "zzz: triggering"
  list = { [] + jobs ?: [jobs] }
  list.each { job ->
    echo "triggering [${job}]"
    build job: job, wait: false
  }
}
