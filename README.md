# CDIO Delopgave 3 - Gruppe 16

###Collaborators
1. **Brugernavn:** s165150 - Morten Enghausen Nielsen (s165150)
2. **Brugernavn:** Kemikaze - Aleksander Wienziers-Madsen (s114750)
3. **Brugernavn:** DonPhister - Nick Skouenborg (s165233)
4. **Brugernavn:** mortentang - Morten René Tang Christiansen (s162682)
5. **Brugernavn:** MartinDahl96 - Jens Martin Dahl-Jensen (s165159)
6. **Brugernavn:** EmilJorgensen - Emil Frederik Rune Jørgensen (s153063)

##Opgavebeskrivelse 
*Version 06. jan. 2016*

###Indledning
IOOuterActive har fået endnu en opgave.
Kundens vision:
Nu har vi terninger og spillere på plads, men felterne mangler stadig en del arbejde. I dette tredje spil ønsker vi derfor at forrige del bliver udbygget med forskellige typer af felter, samt en decideret spilleplade.
Spillerne skal altså kunne lande på et felt og så fortsætte derfra på næste slag. Man går i ring på brættet.
Der skal nu være 2-6 spillere.
Man starter med 30.000.
Spillet slutter når alle, på nær én spiller, er bankerot.


I bilag kan I se en oversigt over de felter vi ønsker, samt en beskrivelse af de forskellige typer.


###Projektlederens bemærkninger:
Husk FURPS+.

![alt tag](http://i.imgur.com/ovad9Np.png)

Forslag til klassediagram med nedarvning.
I kan selvfølgelig godt huske at når noget står i kursiv så er det abstract.
Det er fuldt ud lovligt at ændre på attributterne, men ikke på metoderne og heller ikke på forholdet imellem klasserne. Det er selvfølgeligt tilladt at tilføje både attributter og metoder. Hvis man har en meget god grund til at ville ændre på metoderne kan projektlederen måske give lov til det.

Husk GRASP.

Jeg forventer følgende artefakter:

###Krav / Analyse

1. Kravspecifikation
2. Use-case diagram
3. Use-case beskrivelser. Som minimum skal ”Land on fleet” være fully dressed. Gerne flere.
4. Domæne-model/BCE

###Kode

1. Lav passende konstruktører.
2. Lav passende get og set metoder.
3. Lav passende toString metoder.
4. Lav en klasse GameBoard der kan indeholde alle felterne i et array.
5. Tilføj en toString metode der udskriver alle felterne i arrayet.
6. Lav det spil kunden har bedt om med de klasser I nu har.
7. Benyt GUI'en.

###Design-dokumentation

1. DSD’er (Design Sekvens Diagrammer). Som minimum vil jeg se ”Land on fleet”.
2. Forklar hvad arv er.
3. Forklar hvad abstract betyder.
4. Fortæl hvad det hedder at alle fieldklasserne har en landOnField metode der gør noget forskelligt.
5. Dokumentation for test med screenshots.
6. Dokumentation for overholdt GRASP.

###Test
Lav tre testcases med tilhørende testscripts og testrapporter.
Lav en Junit test til hver af felttypernes ”landOnField”-metode. Den første test er i bilag 2.

###Versionsstyring
Lav et lokal Git-repository som en del af Eclipeprojektet.
Alternativt kan afleveres et link til et repository på nettet eks. https://github.com/cbudtz/TestRepo42.git.
Rapporten skal indeholde en vejledning i hvordan man importerer Get-repository i Eclipse.

###Konfigurationsstyring
Udviklingsplatformen er alt det software i bruger under udviklingen af jeres projekt. Produktionsplatformen er alt det software der skal bruges til at køre jeres færdige program. I dette projekt er de ens. I skal dokumentere platformens dele med versionsnummer så den kan genskabes til senere brug. Jeres platform består af operativsystem, java, og Eclipse samt biblioteket GUI.jar.
Endvidere skal i beskrive hvordan man importerer jeres projekt i Eclipse fra git, og hvordan man kører jeres program.

###Feltliste:

1. Tribe Encampment - Territory - Rent 100 - Price 1000
2. Crater - Territory - Rent 300 - Price 1500
3. Mountain - Territory - Rent 500 - Price 2000
4. Cold Desert - Territory - Rent 700 - Price 3000
5. Black cave - Territory	        Rent 1000	  Price 4000
6. The Werewall - Territory	      Rent 1300	  Price 4300
7. Mountain village - Territory	  Rent 1600	  Price 4750
8. South Citadel - Territory	      Rent 2000	  Price 5000
9. Palace gates - Territory	      Rent 2600	  Price 5500
10. Tower - Territory	              Rent 3200	  Price 6000
11. Castle - Territory	            Rent 4000	  Price 8000
12. Walled city - Refuge - Receive 5000
13. Monastery - Refuge - Receive 500
14. Huts in the mountain - Labor camp	- Pay 100 x dice	Price 2500
15. The pit	- Labor camp - Pay 100 x dice - Price 2500
16. Goldmine - Tax - Pay 2000
17. Caravan - Tax - Pay 4000 or 10% of total assets
18. Second Sail	- Fleet	- Pay 500-4000	- Price 4000
19. Sea Grover - Fleet - Pay 500-4000 - Price 4000
20. The Buccaneers - Fleet - Pay 500-4000 - Price 4000
21. Privateer armade - Fleet - Pay 500-4000 - Price 4000

###Typer af felter:
**Territory**

Et territory kan købes og når man lander på et Territory som er ejet af en anden spiller skal man betale en afgift til ejeren.

**Refuge**

Når man lander på et Refuge får man udbetalt en bonus.

**Tax**

Her fratrækkes enten et fast beløb eller 10% af spillerens formue. Spilleren vælger selv mellem disse to muligheder.

**Labor camp**

Her skal man også betale en afgift til ejeren. Beløbet bestemmes ved at slå med terningerne og gange resultatet med 100. Dette tal skal så ganges med antallet af Labor camps med den samme ejer.

**Fleet**

Endnu et felt hvor der skal betales en afgift til ejeren. Denne gang bestemmes beløbet ud fra antallet af Fleets med den samme ejer, beløbene er fastsat således:

1. Fleet: 	500
2. Fleet:	1000
3. Fleet:	2000
4. Fleet:	4000

###Bilag 2 - Eksempel på JUnit test
import model.Player;
 
import org.junit.*;
 
public class RefugeTest {
   	private Player player;
   	private Field refuge200;
   	private Field refuge0;
   	private Field refugeNeg200;
 
   	@Before
   	public void setUp() throws Exception {
          	this.player = new Player("Anders And", 1, 1000);
          	this.refuge200 = new Refuge(1, "Helle +200", 200);
          	this.refuge0 = new Refuge(2, "Helle 0", 0);
          	this.refugeNeg200 = new Refuge(3, "Helle -200", -200);
   	}
 
   	@After
   	public void tearDown() throws Exception {
          	this.player = new Player("Anders And", 1, 1000);
          	//The fields are unaltered
   	}
   	
   	@Test
   	public void testEntities() {
          	Assert.assertNotNull(this.player);
          	
          	Assert.assertNotNull(this.refuge200);
          	Assert.assertNotNull(this.refuge0);
          	Assert.assertNotNull(this.refugeNeg200);
          	
          	Assert.assertTrue(this.refuge200 instanceof Refuge);
          	Assert.assertTrue(this.refuge0 instanceof Refuge);
          	Assert.assertTrue(this.refugeNeg200 instanceof Refuge);
   	}
 
   	@Test
   	public void testLandOnField200() {
          	int expected = 1000;
          	int actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
          	
          	//Perform the action to be tested
          	this.refuge200.landOnField(this.player);
          	
          	expected = 1000 + 200;
          	actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
   	}
   	@Test
   	public void testLandOnField200Twice() {
          	int expected = 1000;
          	int actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
 
          	//Perform the action to be tested
          	this.refuge200.landOnField(this.player);
          	this.refuge200.landOnField(this.player);
          	
          	expected = 1000 + 200 + 200;
          	actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
   	}
   	
   	@Test
   	public void testLandOnField0() {
          	int expected = 1000;
          	int actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
          	
          	//Perform the action to be tested
          	this.refuge0.landOnField(this.player);
          	
          	expected = 1000;
          	actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
   	}
   	@Test
   	public void testLandOnField0Twice() {
          	int expected = 1000;
          	int actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
 
          	//Perform the action to be tested
          	this.refuge0.landOnField(this.player);
          	this.refuge0.landOnField(this.player);
          	
          	expected = 1000;
          	actual = this.player.getBalance();
   	   	Assert.assertEquals(expected, actual);
   	}
   	
   	@Test
   	public void testLandOnFieldNeg200() {
          	int expected = 1000;
          	int actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
          	
          	//Perform the action to be tested
          	this.refugeNeg200.landOnField(this.player);
          	
          	//It is not possible to deposit a negative amount
          	expected = 1000;
          	actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
   	}
   	@Test
   	public void testLandOnFieldNeg200Twice() {
          	int expected = 1000;
          	int actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
 
          	//Perform the action to be tested
          	this.refugeNeg200.landOnField(this.player);
          	this.refugeNeg200.landOnField(this.player);
          	
          	//It is still not possible to deposit a negative amount
          	expected = 1000;
          	actual = this.player.getBalance();
          	Assert.assertEquals(expected, actual);
   	}
}



