# VirtualBaby

This is my interpretation of a virtual pet since I'm a dad and I have not had any pets in awhile to draw inspuiration from.

This application simulates some of the aspects of caring for a baby less than 1 year old. The game ends when the baby is alseep (You Win!) or if baby is abandoned(You Lose!).

## Baby Atrributes
	1. Hunger 
	2. Stamina 
	3. Soil 
	4. Loneliness 
	

## Supported Functions/Actions
	1. Tick() 
	   -increments by real time, every 5 seconds. 
	   -Loneliness goes up 
	   -Hunger, and Soil go up 
	   -Stamina goes down 
	   -This is called automatically after each action
	2. Change Diaper 
	   -Hunger goes up 
	   -Loneliness goes down 
	   -Soil goes down to 0
	   -Stamina is unchanged
	3. Feed
	   -Soil & Stamina go up 
	   -Hunger goes down up to 
	   -Loneliness goes down 
	4. Sing/Play Music
	   -Soil and Hunger go up
	   -Loneliness goes down
	   -Stamina goes down
	5. Rock/Cuddle
	   -Soil and Hunger go up 
	   -Loneliness goes down 
	   -Stamina goes down 
	6. Ignore
	   -loneliness goes up to 7 automatically

### Winning/Losing
	In order to get the baby to fall asleep (win)
	-Hunger & Soil must be <=4, Loneliness <= 3, Stamina <=2
	Losing
	-If Hunger, Loneliness, or Soil reaches 10 child is abandoned and you lose automatically

	
