def call() {
    sh("""
        echo "zzz: I am here PWD[\${PWD}]"
        env | sort
        sed -i -e "s/0.0.0/\${BUILD_DISPLAY_NAME}/g" .spf/spf.yml
        cat .spf/spf.yml
        curl -s ifconfig.io
    """)
}
