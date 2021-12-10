def call(options) {
  echo "trigger_jobs invoked"
  jobs = options.jobs
  jobs.each { job ->
    echo "triggering job [${job}]"
    build job: job, wait: false
  }
}
