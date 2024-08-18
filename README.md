# Secret Shots
This is a personal project made from a custom board game that I decided that I would bring to a mobile version.

## Game description
The game consists on a deck of card that can be modified and the game will take the deck of the host player.
The cards on the deck hold a description that can be matched with any player.

 ### Each turn
The player whose turn it is is given a random card within the deck, and they have to select another player
 that they think that matches the most with the card description.

The player that receives the card will "roll" to check if the card is shown or not, these are all the possible results:
- **REVEAL** - The card that was given is revealed to every player
- **NOT REVEAL** - The card that was given is not revealed and remains a secret unless for the player who sent it
- **REVEAL FOR EVERYONE BUT YOU** - The card that was given is revealed to every player but the player who it was sent to
- **REVEAL PREVIOUS** - The previous card is revealed if it wasn't revealed on its turn

If the card is not revealed the players can complete a challenge and the player who sent it can give 
permission to the players who complete the challenge to see its content.

 ### End game
When the game has ended each player will get a list of all the cards they sent and another list with 
all the cards they got sent.

## Author
[NefloDev](https://github.com/NefloDev)