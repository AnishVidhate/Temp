import React from "react";
import Card from "./components/Card";
import Footer from "./components/Footer";
import './css/style.css';
import Aot from './images/Aot.jpg';  // Import the local image
import metal from './images/metal.jpg'
import deathNote from './images/deathNote.jpg'
import shippudden from './images/shippudden.jpg'
import narutov from './videos/narutov.mp4'
import onepiece from './images/onepiece.jpg'
import drgonball from './images/dragonball.jpg'
import bleach from './images/bleach.jpg'
import demons from './images/demons.jpg'

const App = () => {
  const animeData = [
    {
      id: 1,
      source: "https://wallpapercave.com/wp/MsDREkd.jpg",
      text: "Naruto Poster",
      title: "Naruto",
      link: "https://www.netflix.com/in/title/70205012",
    },
    {
      id: 2,
      source: shippudden,
      text: "Naruto Shippuden Poster",
      title: "Naruto Shippuden",
      link: "https://www.netflix.com/in/title/80000603",
    },
    {
      id: 3,
      source: Aot,
      text: "Attack on Titan Poster",
      title: "Attack on Titan",
      link: "https://www.netflix.com/in/title/80025781",
    },
    {
      id: 4,
      source: metal,
      text: "Fullmetal Alchemist Poster",
      title: "Fullmetal Alchemist",
      link: "https://www.netflix.com/in/title/70204981",
    },
    {
      id: 5,
      source: deathNote,
      text: "Death Note Poster",
      title: "Death Note",
      link: "https://www.netflix.com/in/title/70204970",
    },
    {
      id: 6,
      source: onepiece,
      text: "One Piece Poster",
      title: "One Piece",
      link: "https://www.netflix.com/in/title/80107103",
    },
    {
      id: 7,
      source: drgonball,
      text: "Dragon Ball Z Poster",
      title: "Dragon Ball Z",
      link: "https://www.netflix.com/in/title/70204960",
    },
    {
      id: 8,
      source: bleach,
      text: "Bleach Poster",
      title: "Bleach",
      link: "https://www.netflix.com/in/title/70205013",
    },
    {
      id: 9,
      source: demons,
      text: "Demon Slayer",
      title: "Demon Slayer",
      link: "https://www.netflix.com/in/title/81091393",
    },
  ];

  const webSeriesData = [
    {
      id: 1,
      source: "https://bit.ly/45jGrZI",
      text: "Money Heist Poster",
      title: "Money Heist",
      link: "https://www.netflix.com/in/title/80192098",
    },
    {
      id: 2,
      source: "https://bit.ly/4cgDXgW",
      text: "Stranger Things Poster",
      title: "Stranger Things",
      link: "https://www.netflix.com/in/title/80057281",
    },
    {
      id: 3,
      source: "https://bit.ly/4bVZ6gG",
      text: "Vikings Poster",
      title: "Vikings",
      link: "https://www.netflix.com/in/title/80025678",
    },
    {
      id: 4,
      source: "https://bit.ly/3VkGdNj",
      text: "The Crown Poster",
      title: "The Crown",
      link: "https://www.netflix.com/in/title/80025678",
    },
    {
      id: 5,
      source: "https://bit.ly/45lFfoA",
      text: "The Witcher Poster",
      title: "The Witcher",
      link: "https://www.netflix.com/in/title/80189685",
    },
  ];

  

  return (
    <div id="root">
      <div className="container">
        <h1>Dive into the World of Anime & Web Series</h1> {/* New headline */}
        <h2>Anime</h2>
        <div className="scroll-container">
          {animeData.map(({ id, source, text, title, link }) => (
            <Card key={id} source={source} text={text} title={title} link={link} />
          ))}
        </div>
        <div className="more-button-container">
          <button className="more-button" onClick={() => window.open('https://www.netflix.com/in/browse/genre/83', '_blank')}>
            More Anime
          </button>
        </div>

        <h2>Web Series</h2>
        <div className="scroll-container">
          {webSeriesData.map(({ id, source, text, title, link }) => (
            <Card key={id} source={source} text={text} title={title} link={link} />
          ))}
        </div>
        <div className="more-button-container">
          <button className="more-button" onClick={() => window.open('https://www.netflix.com/in/browse/genre/83', '_blank')}>
            More Web Series
          </button>
        </div>
      </div>
      <Footer />
    </div>
  );
};

export default App;
//   return (
//     <div id="root">
//       <div className="container">
//         <h2 style={{ color: "white" }}>Anime</h2>
//         <div className="scroll-container">
//           {animeData.map(({ id, source, text, title, link }) => (
//             <Card key={id} source={source} text={text} title={title} link={link} />
//           ))}
//         </div>

//         <h2 style={{ color: "white", marginTop: "40px" }}>Web Series</h2>
//         <div className="scroll-container">
//           {webSeriesData.map(({ id, source, text, title, link }) => (
//             <Card key={id} source={source} text={text} title={title} link={link} />
//           ))}
//         </div>
//       </div>
//       <Footer />
//     </div>
//   );
// };

// export default App;
