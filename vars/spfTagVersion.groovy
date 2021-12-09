def call() {
    sh("""
        echo "zzz: I am here PWD[\${PWD}]"
        env | sort
    """)
}
