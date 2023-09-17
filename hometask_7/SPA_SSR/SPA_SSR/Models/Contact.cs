using System.Diagnostics.Metrics;

namespace SPA_SSR.Models
{
    public class Contact
    {
        private static int Counter = 0;

        private int Id;
        private String FirstName = "";
        private String LastName = "";
        private String Phone = "";
        private String Comment = "";
        private String ImgPath = "";

        public Contact() { 
            init();
        }
        public int getId() { return this.Id; }
        public String getFirstName() { return this.FirstName; }
        public String getLastName() { return this.LastName; }
        public String getPhone() { return this.Phone; }
        public String getComment() { return this.Comment; }
        public String getImgPath() { return this.ImgPath; }
        public void setFirstName(String firstName) { this.FirstName = firstName; }
        public void setLastName(String lastName) { this.LastName = lastName; }
        public void setPhone(String phone) { this.Phone = phone; } 
        public void setComment(String comment) { this.Comment = comment; }
        public void setImgPath(String imagepath) { this.ImgPath = imagepath; }

        private void init() {
            this.Id = Counter;
            Counter++;
            setFirstName(String.Format("Имя контакта {0}", this.Id));
            setLastName(String.Format("Фамилия контакта {0}", this.Id));
            setPhone((Random.Shared.NextInt64(89000000000, 89999999999)).ToString());
            setComment(String.Format("Комментарий контакта {0}", this.Id));
        }

        public static void reset() { 
            Counter = 0;
        }
    }
}
