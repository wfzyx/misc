pub main -> i32
    print("Result: %text%")
        where text: str = 
            ? calc_two_numbers 42 23
            | Just => value
            | Nothing => "Invalid Operation"

calc_two_numbers -> f32 =>
    x, y: i32
    op: i8

    ? op
    | '+' => Just x + y
    | '-' => Just x - y
    | '*' => Just x * y
    | '/' => Just x / y
    |=> Nothing

pub createNewUser -> User
	name: str
	age: i32
	heightCm: i32
	weightKg: i32

	if (x > y) && (x != 0) println("x maior que y e x não é 0")
	elif y > x println("y maior que x")
	: println("qualquer outro cenario")


