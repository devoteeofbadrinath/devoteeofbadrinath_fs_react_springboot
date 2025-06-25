import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart } from "@fortawesome/free-solid-svg-icons";
// import "./footer.css";
import styles from "./footer.module.css";

export default function Footer(){
    const isActive = Math.random() > 0.5;
    return (
        <>
            <h1 
                className={`${styles["my-heading"]} ${
                isActive ? styles["primary-color"] : styles["secondary-color"]
                }`}
            >
                Demo of Global CSS Scope from Home
            </h1>
            {/* <h1 
            style={{
                textAlign: 'center', 
                color: isActive ? '#5B21B6' : '#333'
            }}
        >
            Demo of Global CSS Scope from Footer
            </h1> */}
            {/* <h1 className="my-heading">Demo of Global CSS Scope from Footer</h1> */}
            <footer className={styles.footer}>
            Built with
            <FontAwesomeIcon 
                icon={faHeart}
                className={styles["footer-icon"]}
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