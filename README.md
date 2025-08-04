# TicTacToe
Classic TicTacToe game using Java and JavaSwing for education and self improvement purposes

# 🕹️ Tic Tac Toe - Java GUI (Swing) játék

Ez a program egy klasszikus **Tic Tac Toe** játék (amőba), amelyet **Java Swing** segítségével készítettem. A játék grafikus felületen fut, lehetővé téve két játékos vagy játékos és gép közti játszmát, valamint változtatható a tábla mérete is.

---

## 🚀 Funkciók

- ✅ Grafikus felhasználói felület (`JFrame`, `JButton`)
- ✅ Játékos vs Játékos vagy Játékos vs Számítógép mód
- ✅ Állítható tábla méret (3x3 - 10x10)
- ✅ Automatikus győzelemellenőrzés sor, oszlop, átló mentén
- ✅ Döntetlen felismerés
- ✅ Új játék indítása popup ablakból

---

## 🧱 Fejlesztési szakaszok

### 1. Alaplogika (konzolban)
- Alapvető szabályok (X és O váltakozó lépései)
- Egyszerű győzelemellenőrzés
- Tábla kiírása karakterként

### 2. Swing alap GUI megvalósítása
- `JFrame` ablak létrehozása
- `JButton` gombok hozzáadása egy rácsban (`GridLayout`)
- Eseménykezelők (`ActionListener`) hozzáadása a gombokhoz

### 3. Játékos választás menü
- `JOptionPane.showOptionDialog()` használata a játékmód kiválasztására:
  - Játékos vs Játékos
  - Játékos vs Számítógép

### 4. Számítógép ellenfél (egyszerű AI)
- Gép véletlenszerűen választ szabad mezőt
- Védekezés vagy támadás még nincs benne (további fejlesztés lehetőség)

### 5. Választható tábla méret
- Indításkor a felhasználó megadhatja, hogy mekkora legyen a pálya (pl. 3x3, 5x5)
- A győzelemhez a teljes sor/átló megtöltése szükséges

### 6. Játék vége logika és újrakezdés
- Popup ablak jelzi, ki nyert vagy ha döntetlen lett
- Lehetőség új játék indítására vagy kilépésre

---

## 🛠️ Fejlesztési lehetőségek

- 🧠 **Okosabb AI** (Minimax algoritmus vagy szabályalapú lépések)
- 🎨 **Színes gombok, nyertes sor kiemelése**
- 🎵 **Hanghatások hozzáadása**
- 🧾 **Pontszám követése**
- 🌐 **Online többjátékos mód**
- 🎭 **Téma választás (világos/sötét)**

---

## 🔧 Használat (Eclipse-ben vagy más IDE-ben)

1. Hozz létre egy új Java projektet.
2. Másold be a forráskódot egy új `TicTacToeGUI.java` osztályba.
3. Futtasd a `main()` metódust tartalmazó osztályt.
4. Kövesd a felugró ablakok utasításait (tábla méret, játékmód).
5. Játssz és élvezd!

---


## 📄 Licenc

Ez a projekt szabadon használható, másolható, fejleszthető tanulási célokra.

---

## 👤 Fejlesztő

Ez a játékprogram oktatási céllal készült, a Java GUI programozás gyakorlására.

