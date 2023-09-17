namespace SPA_SSR.Models
{
    public class ContactProvider
    {
        public List<Contact> contacts = new List<Contact>();
        public int activeElement;
        public Contact activeContact = new Contact();

        public ContactProvider() { }
        public ContactProvider(int number) {
            for (int i = 1; i <= number; i++){
                contacts.Add(new Contact());
            }
            activeElement = 0;
            activeContact = contacts.ElementAt(activeElement);
        }

        public void NextContact() {
            activeElement++;
            if (activeElement > contacts.Count() - 1) {
                activeElement = 0;
            }
            activeContact = contacts.ElementAt(activeElement);
        }

        public void PrevContact()
        {
            activeElement--;
            if (activeElement < 0)
            {
                activeElement = contacts.Count() - 1;
            }
            activeContact = contacts.ElementAt(activeElement);
        }
    }
}
