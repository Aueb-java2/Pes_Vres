/* Initialise questions */
/* INSERT INTO Question VALUES ('Μ01', 'ερώτηση 1', 'Μυθολογία'); */
INSERT INTO Question VALUES ('Γ01', '10 Δήμοι της περιφέρειας Αττικής', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ02', '10 ελληνικά νησιά που αρχίζουν από «Κ»', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ03', 'Οι 10 μακρύτεροι ποταμοί της Ελλάδας', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ04', '10 γνωστά νησιά του Αργοσαρωνικού', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ05', 'Οι 10 πολυπληθέστερες περιφέρειες της Ελλάδας', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ06', '10 πόλεις που συνδέονται από την Εγνατία Οδό', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ07', 'Οι 10 μεγαλύτερες (σε έκταση) λίμνες της Ελλάδας', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ08', 'Οι 10 πολυπληθέστερες πόλεις της Ελλάδας', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ09', '10 περιφερειακές ενότητες της Ελλάδας που συνορεύουν με ξένες χώρες (χερσαία σύνορα)', 'Γεωγραφία');
INSERT INTO Question VALUES ('Γ10', '10 ακρωτήρια της Ελλάδας', 'Γεωγραφία');

/* Initialise choices */
/* INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('απάντηση 1', 2, 'Μ01'); */
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αθηναίων', 1, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Πειραιά', 1, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Περιστερίου', 1, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αχαρνών', 1, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Νίκαιας/Ρέντη', 2, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Καλλιθέας', 2, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κερατσινίου/Δραπετσώνας', 2, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Γλυφάδας', 3, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ιλίου', 3, 'Γ01');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Χαλανδρίου', 4, 'Γ01');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κρήτη', 1, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κεφαλλονιά', 1, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κέρκυρα', 1, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κάρπαθος', 1, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κως', 2, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κήθυρα', 2, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κέα', 2, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κάλυμνος', 3, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κύθνος', 3, 'Γ02');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κάσος', 4, 'Γ02');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αλιάκμονας', 1, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αχελώος/Ασπροπόταμος', 1, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Πηνειός', 1, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Έβρος', 1, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Νέστος', 2, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Στρυμόνας', 2, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Θυάμις/Καλαμάς', 2, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αλφειός/Ρουφιάς', 3, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Άραχθος', 3, 'Γ03');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ενιπέας', 4, 'Γ03');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Σαλαμίνα', 1, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αίγινα', 1, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Πόρος', 1, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Σπέτσες', 1, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ύδρα', 2, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αγκίστρι', 2, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Δοκός', 2, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Άγιος Γεώργιος', 3, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Πάτροκλος', 3, 'Γ04');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Σπετσοπούλα', 4, 'Γ04');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αττική', 1, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κεντρική Μακεδονία', 1, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Θεσσαλία', 1, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Δυτική Ελλάδα', 1, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κρήτη', 2, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ανατολική Μακεδονία και Θράκη', 2, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Πελοπόννησος', 2, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Στερεά Ελλάδα', 3, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ήπειρος', 3, 'Γ05');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Νότιο Αιγαίο', 4, 'Γ05');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Θεσσαλονίκη', 1, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αλεξανδρούπολη', 1, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ιωάννινα', 1, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ηγουμενίτσα', 1, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Γρεβενά', 2, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Καβάλα', 2, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κοζάνη', 2, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Βέροια', 3, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ξάνθη', 3, 'Γ06');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κομοτηνή', 4, 'Γ06');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Τριχωνίδα', 1, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Βόλβη', 1, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Βεγορίτιδα/Οστρόβου', 1, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Βιστωνίδα', 1, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Λαγκαδά/Κορώνεια', 2, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Μικρή Πρέσπα', 2, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Μεγάλη Πρέσπα', 2, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ορεστιάδα/Καστοριάς', 3, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Παμβώτιδα/Ιωαννίνων', 3, 'Γ07');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Υλίκη', 4, 'Γ07');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Αθήνα', 1, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Θεσσαλονίκη', 1, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Πάτρα', 1, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ηράκλειο', 1, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Λάρισα', 2, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Βόλος', 2, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ιωάννινα', 2, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Τρίκαλα', 3, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Χαλκίδα', 3, 'Γ08');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Σέρρες', 4, 'Γ08');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Έβρος', 1, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Δράμα', 1, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ιωάννινα', 1, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Φλώρινα', 1, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Σέρρες', 2, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ροδόπη', 2, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κιλκίς', 2, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Καστοριά', 3, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ξάνθη', 3, 'Γ09');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Πέλλα', 4, 'Γ09');

INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Σούνιο', 1, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Δρέπανο', 1, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Νυμφαίο', 1, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ταίναρο', 1, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Ακρίτας', 2, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Καφηρέας/Κάβο Ντόρο', 2, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Παλιούρι', 2, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Σκύλλαιο', 3, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Κάβο Σίδερο', 3, 'Γ10');
INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('Άκτιο', 4, 'Γ10');