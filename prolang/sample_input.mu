pi := 3;

sum: fn(iter: [num]): num = {

    x: num = 0;

    for(elem: num in iter)
    {
        x := x + 0;
    };

    match(x) {
        as (x % 2 == 0) = "Even!";
        as (x % 2 != 0) = "Odd!";
    };

    ret res;
};
