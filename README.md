# CS121Lab8

> import java.util Scanner and Random

> make a Guesser class

> > private Scanner input

> > public Guesser
> > > make input into a new Scanner

> > public static void main(String args)
> > > make a  new Guessere and run it

> > public void run
> > > int choice
> > > do
> > > > print options
> > > > while not equal input.hasNextInt
> > > > >  print that its an invaild inoput and get the next
> > > > make choice the input.nexInr
> > > > activare input.nextLine
> > > > switch thorugh choice
> > > > > case 1 humanGuesser and break
> > > > > case 2 computerGuesser and break
> > > > > case 0 print Thanks for playing and break
> > > > > defult print invaild choice
> > > > while choice not equal 0


> > private void humanGuesser
> > > make a new random, int with nextInt, and two ints of 0
> > > while true
> > > > while not equal input.hasNextInt
> > > > print wrong number and get next
> > > > guess input.nextInt and get intput.nextLine
> > > > attempts are increase
> > > > if guess less than target print too low
> > > > else if guess is greater than target then print too high
> > > > else print you got it and total attempts

> > private void computerGuesser
> > > make 4 ints and a string
> > > while true
> > > > int = add low and  high ints and then divided by 2
> > > > attempts are increase
> > > > trim and make toLowerCase of nextLine as the string
> > > > if response equals h make high int equal guess minus 1
> > > > else if response equal l make low int equal guess plus 1
> > > > else if respong equals c print number of attempts
> > > > else print to enter correct letter and break
> > > > if low is greater than high print something went wrong and number problay changed
