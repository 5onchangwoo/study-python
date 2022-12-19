def matrix_multiple(matrix1, matrix2):
    res = [[0] * len(matrix2[0]) for _ in range(len(matrix1))]
    for i in range(len(matrix1)):
        for j in range(len(matrix2[0])):
            for k in range(len(matrix1[0])):
                res[i][j] += matrix1[i][k] * matrix2[k][j]
    return res


def matrix_square(matrix, b):
    if b == 1:
        return matrix
    div_matrix = matrix_square(matrix, b // 2)
    square_matrix = matrix_multiple(div_matrix, div_matrix)
    if b % 2 == 0:
        return square_matrix
    else:
        return matrix_multiple(square_matrix, matrix)


def fibonacci_div(n):
    matrix = [[1, 1], [1, 0]]
    if n <= 1:
        return n
    else:
        answer = matrix_square(matrix, n - 1)
        return answer[0][0]


print(fibonacci_div(10))
