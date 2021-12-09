def call() {
    sh("""
        echo "spfPackageTagVersion -> spf.yml -> \${BUILD_DISPLAY_NAME}"
        sed -i -e "s/0.0.0/\${BUILD_DISPLAY_NAME}/g" .spf/spf.yml
        curl -s ifconfig.io
    """)
}
