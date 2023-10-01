namespace ClinicDesctop
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            listViewClients = new ListView();
            columnHeaderId = new ColumnHeader();
            columnHeaderSurName = new ColumnHeader();
            columnHeaderFirstName = new ColumnHeader();
            columnHeaderPatronymic = new ColumnHeader();
            btnUpdate = new Button();
            listViewPets = new ListView();
            columnHeader1 = new ColumnHeader();
            columnHeader2 = new ColumnHeader();
            columnHeader3 = new ColumnHeader();
            listViewConsultations = new ListView();
            columnHeader4 = new ColumnHeader();
            columnHeader5 = new ColumnHeader();
            columnHeader6 = new ColumnHeader();
            columnHeader7 = new ColumnHeader();
            SuspendLayout();
            // 
            // listViewClients
            // 
            listViewClients.Columns.AddRange(new ColumnHeader[] { columnHeaderId, columnHeaderSurName, columnHeaderFirstName, columnHeaderPatronymic });
            listViewClients.FullRowSelect = true;
            listViewClients.GridLines = true;
            listViewClients.Location = new Point(14, 16);
            listViewClients.Margin = new Padding(3, 4, 3, 4);
            listViewClients.MultiSelect = false;
            listViewClients.Name = "listViewClients";
            listViewClients.Size = new Size(886, 175);
            listViewClients.TabIndex = 1;
            listViewClients.UseCompatibleStateImageBehavior = false;
            listViewClients.View = View.Details;
            listViewClients.SelectedIndexChanged += listViewClients_SelectedIndexChanged;
            // 
            // columnHeaderId
            // 
            columnHeaderId.Text = "#";
            // 
            // columnHeaderSurName
            // 
            columnHeaderSurName.Text = "Фамилия";
            columnHeaderSurName.Width = 300;
            // 
            // columnHeaderFirstName
            // 
            columnHeaderFirstName.Text = "Имя";
            columnHeaderFirstName.Width = 300;
            // 
            // columnHeaderPatronymic
            // 
            columnHeaderPatronymic.Text = "Отчество";
            columnHeaderPatronymic.Width = 300;
            // 
            // btnUpdate
            // 
            btnUpdate.Location = new Point(358, 531);
            btnUpdate.Margin = new Padding(3, 4, 3, 4);
            btnUpdate.Name = "btnUpdate";
            btnUpdate.Size = new Size(137, 69);
            btnUpdate.TabIndex = 2;
            btnUpdate.Text = "Обновить";
            btnUpdate.UseVisualStyleBackColor = true;
            btnUpdate.Click += btnUpdate_Click;
            // 
            // listViewPets
            // 
            listViewPets.Columns.AddRange(new ColumnHeader[] { columnHeader1, columnHeader2, columnHeader3 });
            listViewPets.FullRowSelect = true;
            listViewPets.GridLines = true;
            listViewPets.Location = new Point(14, 199);
            listViewPets.Margin = new Padding(3, 4, 3, 4);
            listViewPets.MultiSelect = false;
            listViewPets.Name = "listViewPets";
            listViewPets.Size = new Size(886, 158);
            listViewPets.TabIndex = 3;
            listViewPets.UseCompatibleStateImageBehavior = false;
            listViewPets.View = View.Details;
            listViewPets.SelectedIndexChanged += listViewPets_SelectedIndexChanged;
            // 
            // columnHeader1
            // 
            columnHeader1.Text = "#";
            // 
            // columnHeader2
            // 
            columnHeader2.Text = "Клиент";
            columnHeader2.Width = 400;
            // 
            // columnHeader3
            // 
            columnHeader3.Text = "Кличка";
            columnHeader3.Width = 400;
            // 
            // listViewConsultations
            // 
            listViewConsultations.Columns.AddRange(new ColumnHeader[] { columnHeader4, columnHeader5, columnHeader6, columnHeader7 });
            listViewConsultations.FullRowSelect = true;
            listViewConsultations.GridLines = true;
            listViewConsultations.Location = new Point(16, 365);
            listViewConsultations.Margin = new Padding(3, 4, 3, 4);
            listViewConsultations.MultiSelect = false;
            listViewConsultations.Name = "listViewConsultations";
            listViewConsultations.Size = new Size(884, 158);
            listViewConsultations.TabIndex = 4;
            listViewConsultations.UseCompatibleStateImageBehavior = false;
            listViewConsultations.View = View.Details;
            listViewConsultations.SelectedIndexChanged += listViewConsultations_SelectedIndexChanged;
            // 
            // columnHeader4
            // 
            columnHeader4.Text = "#";
            // 
            // columnHeader5
            // 
            columnHeader5.Text = "Клиент";
            columnHeader5.Width = 300;
            // 
            // columnHeader6
            // 
            columnHeader6.Text = "Кличка";
            columnHeader6.Width = 300;
            // 
            // columnHeader7
            // 
            columnHeader7.Text = "Дата";
            columnHeader7.Width = 300;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1221, 610);
            Controls.Add(listViewConsultations);
            Controls.Add(listViewPets);
            Controls.Add(btnUpdate);
            Controls.Add(listViewClients);
            Margin = new Padding(3, 4, 3, 4);
            Name = "Form1";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Моя клиника";
            ResumeLayout(false);
        }

        #endregion

        private ListView listViewClients;
        private Button btnUpdate;
        private ColumnHeader columnHeaderId;
        private ColumnHeader columnHeaderSurName;
        private ColumnHeader columnHeaderFirstName;
        private ColumnHeader columnHeaderPatronymic;
        private ListView listViewPets;
        private ColumnHeader columnHeader1;
        private ColumnHeader columnHeader2;
        private ColumnHeader columnHeader3;
        private ListView listViewConsultations;
        private ColumnHeader columnHeader4;
        private ColumnHeader columnHeader5;
        private ColumnHeader columnHeader6;
        private ColumnHeader columnHeader7;
    }
}