resource "aws_iam_policy" "admin_everywhere" {
  name = "admin-everywhere-test"

  policy = jsonencode({
    Version = "2012-10-17"
    Statement = [{
      Effect   = "Allow"
      Action   = "*"
      Resource = "*"
    }]
  })
}
