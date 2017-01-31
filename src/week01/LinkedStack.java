package week01;

/**
 * Created by awo on 30/01/17.
 */
public class LinkedStack {
    private class Element {
        private Object object;
        private Element next;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }
    }

    private Element firstElement;
    private Element currentElement;


}
