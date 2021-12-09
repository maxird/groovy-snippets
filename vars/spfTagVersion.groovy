def call() {
    sh("""
        echo "zzz: I am here"
        env | sort
    """)
}
