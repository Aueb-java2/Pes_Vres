# ReadMe του παιχνιδιού Πες-Βρες

# Οδηγίες μετταγλώτισης του προγράμματος

Εxport Jar File from Eclipse

# Οδηγίες εκτέλεσης του προγράμματος

java -jar (path)/PesVres.jar

όπου path εκεί που είναι αποθηκευμένο το παιχνίδι

# Οδηγίες χρήσης του προγράμματος

Εκτελείτε από την γραμμή εντολών το Jar File
με την εντολή java -jar (path)/PesVres.jar

# Σύντομη παρουσίαση της δομής των περιεχομένων του αποθετηρίου

Η κλάση Choices: εκτυπώνει και διαβάζει τις επιλογές που δίνει ο χρήστης για κάθε παιχνίδι

Η κλάση Countdown: εκτυπώνει και διαβάζει τους πόντους που παίρνει καθε ομαδα
σε κάθε γύρο του παιχνιδιού

Η κλάση Input: είναι μια κλάση για την είσοδο που δίνει κάθε φορά
ο χρήστης,ανάλογα την είσοδο υπάρχει και διαφορετική μέθοδος 

Η κλάση Rules: περιέχει τους κανόνες του παιχνιδιού

Η κλάση Menu: εμφανίζει την αρχικη σελίδα του παιχνιδιόυ και δίνει 
την δυνατότητα στον χρήστη να διαλέξει αν θέλει να παίξει, να διαβάσει
τους κανόνες ή να αποχωρήσει απο το παιχνίδι

Η κλάση Round: διαβάζει και εκτυπώνει τον γύρο του παιχνιδιού και τα δευτερόλεπτα 
που έχει κάθε ομάδα μετά από κάθε απάντηση

Η κλάση team: αφορά τις δύο ομάδες και έχει τα χαρακτηριστικά της ομάδας 

Η κλάση Game: έχει έναν κατασκευαστή που δημιουργεί ενα αντικείμενο game 
ανάλογα με τα choices που έχει δώσει ο παίκτης

Η κλάση Main: εκτυπώνει το header και έχει μια επανάληψη ανάλογα
με την επιλογή που δίνει ο χρήστης

Η κλάση Search: περιέχει την μέθοδο της σειριακής αναζητησης

Η κλάση Driver: συνδέει την βάση δεδομένων με τον κώδικα του παιχνιδιού

Το αρχείο SQL περιέχει τα δεδομένα που είναι αποθηκευμένα στην Βάση Δεδομέων.
