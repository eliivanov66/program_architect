using Microsoft.AspNetCore.Mvc;
using SPA_SSR.Models;
using static System.Net.Mime.MediaTypeNames;

namespace SPA_SSR.controllers
{
    public class ContentController : Controller
    {
        static ContactProvider DB;
        public IActionResult Home()
        {
            return View();
        }

        public IActionResult Contacts()
        {
            Contact.reset();
            List<String> images = FindImages();
            if (DB == null)
            {
                DB = new ContactProvider(images.Count());
                for (int i = 0; i < images.Count(); i++)
                {
                    DB.contacts.ElementAt(i).setImgPath(images.ElementAt(i));
                }
            }
            return View(DB);
        }
        public IActionResult NextContact() { 
            DB.NextContact();
            return View(DB);
        }

        public IActionResult PrevContact()
        {
            DB.PrevContact();
            return View(DB);
        }
        private List<String> FindImages() {

            List<String> GraphImages = new List<string>();
            IEnumerable<String> Images = Directory.EnumerateFiles("./wwwroot/img/", "*.jpg");
            foreach (String Image in Images)
            {
                if (Image != null)
                {
                    GraphImages.Add(Image.Replace("./wwwroot", ""));
                }

            }

            Images = Directory.EnumerateFiles("./wwwroot/img/", "*.png");
            foreach (String Image in Images)
            {
                if (Image != null)
                {
                    GraphImages.Add(Image.Replace("./wwwroot", ""));
                }

            }

            Images = Directory.EnumerateFiles("./wwwroot/img/", "*.bmp");
            foreach (String Image in Images)
            {
                if (Image != null)
                {
                    GraphImages.Add(Image.Replace("./wwwroot", ""));
                }

            }
            return GraphImages;
        }

        public IActionResult Info()
        {
            return View();
        }
    }
}
