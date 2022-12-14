package de.verfxgbar.utils;

/*
 * a) Vergleiche die Klasse Stack mit der Klasse List bzw. Queue hinsichtlich der jeweils 
	verwendeten Zeiger / Referenzen. Worin besteht der wesentliche Unterschied?
	Beschreibe kurz! (Quelltext siehe Anhang 2. Die dabei intern zusätzlich abgedruckte 
	innere Klasse dient nur der Vollständigkeit halber.)
	
	-> Bei einem Stack gibt es nur einen "Head" Zeiger.
	
	b) Während das Methodenrepertoire in der Klasse List breit gefächert ist, ist die 
	Methodenvielfalt der Klasse Stack stark reduziert. Gebe zu jeder der fünf Methoden 
	der Klasse Stack eine Kurzbeschreibung an, aus der hervor geht, was die jeweilige 
	ethode macht – ggf. mit Skizze / Visualisierung in der bekannten Vorher-NachherKnotendarstellung – und wie diese grob funktioniert.
	
	i) Stack(), -> Erstellt einen Stack
	ii) isEmpty(), -> fragt ab, ob head == null ist
	iii) push(ContentType pContent),  -> Setzt einen neuen Knoten nach ganz oben vom Stack.
	iv) pop(), -> Löst den Knoten vom Stack der sich momentan ganz oben befindet.
	v) top() -> gibt den Knoten vom Stack ganz oben aus (Vorausgesetzt es gibt einen).
	
	c) Erkläre auf Basis der Ergebnisse aus Teilaufgabe b) wodurch sich die Datenstruktur 
	eines Stapels auszeichnet und grenze die Datenstruktur Stapel von der Datenstruktur 
	Liste bzw. Schlange ab. Finde zwei mögliche sinnvolle Einsatzzwecke für die neue 
	Datenstruktur
	-> Die Datenstruktur "Stack" eignet sich gut für "Back"-Buttons wie zum Beispiel in Paint. 
	Beispiel: Du möchtest einen Strich den du gerade als letztes gemalt hast löschen. Dafür eignet sich ein Stack als DatenspeicherDingsDa.
 */
public class Stack<ContentType> {
	/* --------- Anfang der privaten inneren Klasse -------------- */
	private class StackNode {
		private ContentType content = null;
		private StackNode nextNode = null;

		public StackNode(ContentType pContent) {
			content = pContent;
			nextNode = null;
		}

		public void setNext(StackNode pNext) {
			nextNode = pNext;
		}

		public StackNode getNext() {
			return nextNode;
		}

		public ContentType getContent() {
			return content;
		}
	}

	/* --------- Ende der privaten inneren Klasse -------------- */
	private StackNode head;

	public Stack() {
		head = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void push(ContentType pContent) {
		if (pContent != null) {
			StackNode node = new StackNode(pContent);
			node.setNext(head);
			head = node;
		}
	}

	public void pop() {
		if (!isEmpty()) {
			head = head.getNext();
		}
	}

	public ContentType top() {
		if (!this.isEmpty()) {
			return head.getContent();
		} else {
			return null;
		}
	}
}
