using ClinicClientNamespace;

namespace ClinicDesctop
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            ClinicClient clinicClient = new ClinicClient("http://localhost:5076/", new HttpClient());
            ICollection<Client> clients = clinicClient.ClientGetAllAsync().Result;
            ICollection<Pet> pets = clinicClient.PetGetAllAsync().Result;
            ICollection<Consultation> consultations = clinicClient.ConsultationGetAllAsync().Result;

            listViewClients.Items.Clear();
            foreach (Client client in clients)
            {
                ListViewItem item = new ListViewItem();
                item.Text = client.ClientId.ToString();
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.SurName
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.FirstName
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.Patronymic
                });
                listViewClients.Items.Add(item);
            }

            listViewPets.Items.Clear();
            foreach (Pet pet in pets)
            {
                ListViewItem item = new ListViewItem();
                item.Text = pet.PetId.ToString();
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.ClientId.ToString()
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.Name
                });

            }

            listViewConsultations.Items.Clear();
            foreach (Consultation consultation in consultations)
            {
                ListViewItem item = new ListViewItem();
                item.Text = consultation.ConsultationId.ToString();
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = consultation.ClientId.ToString()
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = consultation.PetId.ToString()
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = consultation.ConsultationDate.ToString()
                });
            }

        }

        private void listViewClients_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void listViewPets_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void listViewConsultations_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }

    public partial class Sample
    {
        public int a;
    }
}