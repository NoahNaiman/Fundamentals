import itertools

def construct_board():
	board = [[0 for x in range(8)] for x in range(8)]
	return board

def print_board(board):
	for i in range(len(board)):
		for j in range(len(board[i])):
			print(board[i][j], end=' ')
		print()

def check_forward(row, columnRange):
	for x in columnRange:
		if(board[row][x] != 0):
			return False
	return True

def check_backward(row, columnRange):
	for x in columnRange:
		if(board[row][x] != 0):
			return False
	return True

def check_up(rowRange, column):
	for y in rowRange:
		if(board[y][column] != 0):
			return False
	return True

def check_down(rowRange, column):
	for y in rowRange:
		if(board[y][column] != 0):
			return False
	return True

def check_forward_down(rowRange, columnRange):
	for y, x in zip(rowRange, columnRange):
		if(board[y][x] != 0):
			return False
	return True

def check_backward_down(rowRange, columnRange):
	for y, x in zip(rowRange, columnRange):
		if(board[y][x] != 0):
			return False
	return True

def check_forward_up(rowRange, columnRange):
	for y, x in zip(rowRange, columnRange):
		if(board[y][x] != 0):
			return False
	return True

def check_backward_up(rowRange, columnRange):
	for y, x in zip(rowRange, columnRange):
		if(board[y][x] != 0):
			return False
	return True

def is_valid(row, column):
	rowRangeForward = range(row, 8)
	rowRangeBackward = range(row, -1, -1)
	columnRangeForward = range(column, 8)
	columnRangeBackward = range(column, -1, -1)

	return(check_forward(row, columnRangeForward) and check_backward(row, columnRangeBackward) and check_up(rowRangeBackward, column) and
		check_down(rowRangeForward, column) and check_forward_down(rowRangeForward, columnRangeForward) and
		check_backward_down(rowRangeForward, columnRangeBackward) and check_forward_up(rowRangeBackward, columnRangeForward)
		and check_backward_up(rowRangeBackward, columnRangeBackward))

def solve_eight_queens(spaceID):
	if(spaceID >= 8):
		print_board(board)
		return True
	
	for i in range(spaceID, 64):
		row = i//8
		column = i%8
		if(is_valid(row, column)):
			board[row][column] = 1
			print_board(board)
			print()
			if(solve_eight_queens(spaceID+1)):
				return True
			board[row][column] = 0
	return False


if __name__ == '__main__':
	board = construct_board()
	board[1][1] = 1
	solve_eight_queens(0)


