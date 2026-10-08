[README.md](https://github.com/user-attachments/files/33155101/README.md)
Kassaboken

1. Datasäkerhet/Inkapsling

Jag har skyddat kontots uppgifter genom att göra fälten `owner` och `balance` privata i Account-klassen och bara ge tillgång via metoder som `getBalance()` och `withdraw()`. Jag har också en kontroll i `withdraw()` som stoppar uttag om beloppet är för stort. Om jag inte gjorde det kunde man ändra saldot direkt och ta ut hur mycket som helst, även till minus. 

2. Skapande-mönster (Factory)

Kontot skapas via registrets metod `addAccount()` istället för direkt i Main för att samla all logik på ett ställe. Det gör koden mer organiserad och lättare att ändra senare. Om jag skapade konton direkt i Main skulle Main bli för stor och ha för mycket ansvar. 

3. Flöde

Om användaren väljer menyval 4. Ta ut: Användaren matar in ägarens namn och belopp i Main. Main skickar namnet till AccountRegister som hanterar det via metoden `findAccount()`. Om kontot hittas körs metoden `withdraw()` på Account-objektet. Om beloppet är för stort skrivs "Fel: Inte tillrackligt med pengar".

 4. Reflektion

När jag körde fast med Scanner som hoppade över namn-inmatningen sökte jag på Google och frågade AI. Jag fick förklaringen att man måste använda `nextLine()` efter `nextInt()`. Jag förstod problemet och ändrade koden själv så att menyn fungerar korrekt.

<img width="160" height="90" alt="74bdd788-52b6-4ac3-88ea-74ffbed00216" src="https://github.com/user-attachments/assets/8a9cf8ac-a5c2-4130-8062-1aee25f74c24" />
 
Det här är video: https://youtu.be/uFF_dY0a2Wo 
