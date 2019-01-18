# VirtualBaby

This is my interpretation of a virtual pet since I'm a dad and I have not had any pets in awhile to draw inspuiration from.

This application simulates some of the aspects of caring for a baby less than 1 year old. The game ends when the baby is alseep (You Win!) or if baby is abandoned(You Lose!).

## Baby Atrributes
	1. Hunger (goes from maximum to minimum in 2 virtual hours with no action)
	2. Stamina (goes from maximum to minimum in 6 virtual hours with no action)
	3. Soil (goes from minimum to maximum in 2 virtual hours with no action)
	4. Loneliness (goes from minimum to maximum in 1 virtual hour)
	

## Supported Functions/Actions
	1. Tick() 
	   -increments attributes every action (assumes even passage of time between each action)
	   -Hunger, Soil, and Loneliness go up
	   -Stamina goes down
	2. Change Diaper 
	   -Hunger goes up 5 points
	   -Loneliness goes down 3 points
	   -Soil goes down to 0
	   -Stamina is unchanged
	3. Feed
	   -Soil & Stamina go up 5 points
	   -Hunger goes down up to 7 points 
	   -Loneliness goes down 5 points
	4. Sing/Play Music
	   -Soil and Hunger go up 2 points
	   -Loneliness goes down 5 points
	   -Stamina goes down 2 points
	5. Rock/Cuddle
	   -Soil and Hunger go up 3 points
	   -Loneliness goes down 6 points
	   -Stamina goes down 4 points
	6. Do Nothing
	   -1 tick passes nothing else changes

### Winning/Losing
	In order to get the baby to fall asleep (win)
	-Hunger, Loneliness, and Soil must be <= 1, Stamina must be <= 3
	Losing
	-If Hunger, Loneliness, or Soil reaches 10 child is abandoned and you lose automatically

	
