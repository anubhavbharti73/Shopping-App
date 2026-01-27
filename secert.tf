variable "db_password" {
  default = "SuperInsecurePassword123!"
}

resource "aws_db_instance" "insecure_db" {
  identifier = "insecure-db"
  engine     = "mysql"
  instance_class = "db.t3.micro"

  username = "admin"
  password = var.db_password

  publicly_accessible = true
  skip_final_snapshot = true
}
