import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart } from "@fortawesome/free-solid-svg-icons";
import "./footer.css";

export default function Footer(){
    return (
        <>
            <h1 className="my-heading">Demo of Global CSS Scope from Footer</h1>
            <footer className="footer">
            Built with
            <FontAwesomeIcon 
                icon={faHeart}
                className="footer-icon"
                aria-hidden="true"
            />
            by
            <a href="https://brdjdob.com/" target="_blank" rel="noreferrer">
                brdjdob    
            </a>
            </footer>
        </>
        
    );
}