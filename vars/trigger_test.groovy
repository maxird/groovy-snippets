def call(options) {
  echo "zzz: triggering"
  jobs = options.message.jobs
  jobs.each { job ->
    echo "triggering [${job}]"
    build job: job, wait: false
  }
}
