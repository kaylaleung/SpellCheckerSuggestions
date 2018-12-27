# Spell Checker Suggestions

* Implements a spelling checker by using a hash table. 
* Creates a dictionary of correctly spelled words.
* The program prompts the user to type a word and checks for misspelled words. If the word is spelled correctly it prints out “no mistakes found”. 
* For misspelled words the program list any words in the dictionary that are obtainable by applying any of the following rules:

1. Add one character to the beginning
2. Add one character to the end
3. Remove one character to the beginning
4. Remove one character from the end
5. Exchange adjacent characters

### Sample Run

Enter Word:

fetchingly

*No mistakes found*

#### (a) Add one character to the beginning

Enter Word:

ature

*Mistakes found*

Possible Words:

mature

nature

autre

#### (b) Add one character to the end

Enter Word:

timidnes

*Mistakes found*

Possible Words:

timidness

#### (c) Remove one character to the beginning

Enter Word:

baardvark

*Mistakes found*

Possible Words:

aardvark

#### (d) Remove one character from the end

Enter Word:

mustyy

*Mistakes found*

Possible Words:

musty

#### (e) Exchange adjacent characters

Enter Word:

scalloin

*Mistakes found*

Possible Words:

scallion
