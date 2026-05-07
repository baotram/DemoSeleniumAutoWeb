pipeline {
    // Chạy trên bất kỳ máy Agent nào có sẵn
    agent any

    // Khai báo công cụ (phải khớp tên trong Manage Jenkins > Tools)
    tools {
        maven 'Maven_3.9'
        jdk 'Java_22'
    }

    // Các bước thực hiện
    stages {
        stage('Step 1: Checkout') {
            steps {
                // Lấy code từ Git (Jenkins tự hiểu nếu cấu hình trong Job)
                checkout scm
            }
        }

        stage('Step 2: Build & Compile') {
            steps {
                // Biên dịch code để kiểm tra lỗi cú pháp
                sh 'mvn clean compile'
            }
        }

        stage('Step 3: Run Selenium Tests') {
            steps {
                            // Sử dụng biến từ giao diện Jenkins truyền vào lệnh Maven
                            sh "mvn test -Dbrowser=${params.BROWSER} -Dheadless=${params.IS_HEADLESS}"
              }
        }
    }

    // Hành động sau khi chạy xong
    post {
        always {
            // Lưu kết quả test (nếu có file xml trong target/surefire-reports)
            junit '**/target/surefire-reports/*.xml'

            // Thông báo kết quả ra màn hình console
            echo 'Quy trình CI/CD đã hoàn tất!'
        }
        success {
            echo 'Chúc mừng! Tất cả các bài test đều PASS 🟢'
        }
        failure {
            echo 'Cảnh báo! Có bài test bị FAIL hoặc lỗi hệ thống 🔴'
        }
    }
}
