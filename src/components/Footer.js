import React from "react";

const Footer = () => {
  return (
    <footer style={footerStyle}>
      <div style={{ textAlign: "center", color: "#ffffff" }}>
        <h4>Contact Us</h4>
        <p>
          Irrigation colony, Sangamner, India <br />
          Phone: <a href="+91 9503590278">+91 9503590278</a> <br />
          Email: <a href="anishvidhate1234@mail.com">anishvidhate1234@gmail.com</a>
        </p>
        <p>&copy; 2024 My Anime and Series Website</p>
      </div>
    </footer>
  );
};

const footerStyle = {
  backgroundColor: "#242424",
  padding: "20px 0",
  width: "100%",
  marginTop: "auto",  // This ensures the footer is pushed down after content
};

export default Footer;
