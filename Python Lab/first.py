import turtle

def draw_flower():
    # Setup screen
    screen = turtle.Screen()
    screen.bgcolor("white")

    # Create turtle
    pen = turtle.Turtle()
    pen.shape("turtle")
    pen.speed(10)
    pen.color("blue", "sky blue")

    # Draw petals
    pen.begin_fill()
    for i in range(36):
        for j in range(2):
            pen.circle(100, 60)
            pen.left(120)
        pen.left(10)
    pen.end_fill()

    # Draw center
    pen.penup()
    pen.goto(0, -20)
    pen.pendown()
    pen.color("Light blue")
    pen.begin_fill()
    pen.circle(20)
    pen.end_fill()

    # Hide turtle
    pen.hideturtle()

    # Keep window open
    turtle.done()


# Run program
if __name__ == "__main__":
    draw_flower()
